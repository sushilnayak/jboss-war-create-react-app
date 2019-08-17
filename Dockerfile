## Copied from https://medium.com/@gloriapalmagonzalez/example-dockerfile-jboss-eap-7-for-deploying-an-application-using-the-deployment-scanner-e6841bc180

FROM registry.access.redhat.com/jboss-eap-7/eap71-openshift
MAINTAINER "FirstName LastName" "emailaddress@gmail.com"
COPY target/war-reactjs-practice.war $JBOSS_HOME/standalone/deployments/
USER root
RUN chown jboss:jboss $JBOSS_HOME/standalone/deployments/war-reactjs-practice.war
USER jboss