Template Flows to handle attachments in Mule
---------------------------------------------


This single Mavenized Mule application contains sample flows that you can extend to handle attachments ('read' as well as 'write') in your request processing.

Contents
--------

1. **attachments-with-rest-as-primary.xml**: Contains requests built with REST in mind.
2. **attachments-with-soap-as-primary.xml**: Contains requests built with SOAP in mind.

While this is opened in Aypoint Studio, you may look in the 'Notes' section of individual elements and flows for more information

Usage
-----
1. Clone the project/Download as zip and extract
2. Import as Maven project using pom.xml from Anypoint Studio

This has been tested to work with Mule 3.9.1 EE and has been developed on Anypoint Studio - Tooling for Mule ESB Version: 6.5.1 Build Id: 201810012018

Might need slight changes to work with other versions. If you had to make any changes, please send a pull request.

Contributions are welcome!

Resources that helped
----------------------

1. https://www.soapui.org/docs/soap-and-wsdl/attachments.html
2. https://stackoverflow.com/questions/21235907/example-for-adding-attachment-to-email-at-mule
3. http://www.mulesoft.org/docs/site/current3/apidocs/org/mule/api/MuleMessage.html#addAttachment(java.lang.String,%20javax.activation.DataHandler)
4. http://wiki.cdyne.com/index.php/Main_Page (A great list of usable hosted SOAP services in 2018)
5. https://www.appnovation.com/blog/mtom-web-services-mule
