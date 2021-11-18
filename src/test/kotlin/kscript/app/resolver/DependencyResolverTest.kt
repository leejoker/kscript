package kscript.app.resolver

import kscript.app.model.Dependency
import kscript.app.model.Repository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalStateException

class DependencyResolverTest {
    private val dependencyResolver = DependencyResolver(
        setOf(
            Repository(
                "imagej-releases",
                "http://maven.imagej.net/content/repositories/releases"
            )
        )
    )

    @Test
    fun `Resolve dependencies`() {
        println(dependencyResolver.resolve(setOf(Dependency("log4j:log4j:1.2.14"))))

        //throw IllegalStateException()

        //TODO clear local file first
        dependencyResolver.resolve(setOf(Dependency("net.clearvolume:cleargl:jar:2.0.1")))


//        assertThrows<RuntimeException> {
//            dependencyResolver.resolve(setOf(Dependency("log4j:log4j:9.8.76")))
//        }
    }
}