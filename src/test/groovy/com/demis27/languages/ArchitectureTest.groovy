package com.demis27.languages

import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.lang.ArchRule
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition
import org.junit.jupiter.api.Test

class ArchitectureTest {

    @Test
    void "Domain should not depend on other layers"() {
        def importedClasses = new ClassFileImporter().importPackages("com.demis27.languages")

        ArchRule rule = ArchRuleDefinition.noClasses()
                .that().resideInAPackage("..domain..")
                .should().dependOnClassesThat()
                .resideInAnyPackage("..adapter..", "..application..")

        rule.check(importedClasses)
    }
}
