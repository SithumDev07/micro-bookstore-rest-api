FROM zeigren/payara-server-docker

COPY ./target/micro.war $DEPLOY_DIR