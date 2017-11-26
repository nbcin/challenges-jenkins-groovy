node {
    try {
        stage('Build') {
            echo 'Building..'
        }
        stage('Test') {
            build job: "CommonServerCheckRepo"
        }
        if (whether_skip_deploy == false) {
            stage('Deploy') {
                echo 'Deploying....'
           }
    }
    finally {
        echo "Finally Actions"
    }
}
