job('click-counter-generated-job') {
    scm {
        git('https://github.com/m41na/click-counter.git') { node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('zes.ty@aol.com')
        }
    }

    triggers {
        scm('H/5 * * * *')
    }

    wrappers {
        nodejs('node16')
    }

    steps {
        shell('npm i')
    }
}