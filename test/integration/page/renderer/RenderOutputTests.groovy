package page.renderer

import org.junit.Assert
import org.junit.Test

class RenderOutputTests {
//testing
    def renderService

    @Test
    void welcomeMessage() {
        Assert.assertEquals "Hi, mrhaki", renderService.createWelcomeMessage().trim()
    }

    @Test
    void confirmMessage() {
        def expectedOutput = '''        <!doctype html>
        <html>
        <head>
            <title>Confirmation</title>
        </head>

        <body>

        <h2>Hi, mrhaki
        </h2>

        <p>
            Thank you for your registration.
        </p>

        <p>
            To use the application can you directly go to the
            <a href="http://localhost:8080/index">home page</a>.
        </p>

        </body>
        </html>
        '''

        Assert.assertEquals expectedOutput.stripIndent(), renderService.createConfirmMessage()
    }

}
