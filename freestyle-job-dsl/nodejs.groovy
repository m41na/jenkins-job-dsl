job('Node js example') {
    scm {
        git('git@github.com:m41na/jenkins-job-dsl.git') { node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-admin@aol.com')
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