environments {
    dev {
        profile = 'dev'
        artifactory {
            host.url = 'http://dev/artifactory'
            repokey = 'dev-snapshot-local'
            username = 'sample'
            password = 'sample'
        }
    }
}