package bo.edu.usfx.biblioteca.arquitectura;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "bo.edu.usfx.biblioteca")
class ReglasDisenoTest {

    @ArchTest
    static final ArchRule elDominioEsTotalmenteIndependiente = noClasses()
            .that().resideInAPackage("..dominio..")
            .should().dependOnClassesThat()
            .resideInAnyPackage("..aplicacion..", "..infraestructura..", "..presentacion..", "..legado..");

    @ArchTest
    static final ArchRule laAplicacionNoDependeDeLaInfraestructura = noClasses()
            .that().resideInAPackage("..aplicacion..")
            .should().dependOnClassesThat()
            .resideInAPackage("..infraestructura..");

    @ArchTest
    static final ArchRule laInfraestructuraDependeDelDominio = classes()
            .that().resideInAPackage("..infraestructura..")
            .should().dependOnClassesThat()
            .resideInAPackage("..dominio..");

    @ArchTest
    static final ArchRule presentacionSoloHablaConAplicacion = noClasses()
            .that().resideInAPackage("..presentacion..")
            .should().dependOnClassesThat()
            .resideInAnyPackage("..infraestructura..");

    @ArchTest
    static final ArchRule ceroUsoDeSystemOutEnReglasDeNegocio = noClasses()
            .that().resideInAPackage("..dominio..")
            .should().callMethod(System.class, "out")
            .orShould().callMethod(System.class, "err");

   @ArchTest
    static final ArchRule interfacesDePuertosTienenNombresClaros = classes()
            .that().resideInAPackage("..dominio..")
            .and().haveSimpleNameStartingWith("Repositorio") // ¡Aquí está la magia!
            .should().beInterfaces();
}