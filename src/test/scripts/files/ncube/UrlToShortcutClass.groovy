package files.ncube

import ncube.grv.exp.NCubeGroovyExpression

class UrlToShortcutClass extends NCubeGroovyExpression
{
    def run()
    {
        @([name:'urlToRemoteClass'])
        output.urlToShortcutClass = this.class
    }
}