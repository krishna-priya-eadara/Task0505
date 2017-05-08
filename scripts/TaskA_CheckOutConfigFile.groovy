#!/usr/bin/env groovy


try {
	pipeline {
        stages {
            stage('Git Checkout Config') {
                steps {
                    echo 'Hello World'
                }
            }
        }
    }
}
catch(Exception e) {
	
}
finally {
	
}


