# java-api
Java Library for connecting with Verso

The java API client example was developed using the Netbeans IDE. In order to test the project you will need to:

1- Download and install Netbeans IDE, here are some links that could be useful:
- https://netbeans.org/downloads/  Netbeans IDE download link
- https://netbeans.org/community/releases/80/install.html Netbeans IDE installation instructions.

2- Download the API client code from the following GitHub repository:
Here we have two options:
 - Download as .zip directly with the following link: https://github.com/Verso-Services/java-api/archive/master.zip .
 - Or Download it from https://github.com/Verso-Services/java-api using git bash

3- Open the downloaded project on Netbeans IDE:
 - Under the VersoClient.java file you will be able to see how to connect to Verso API in the ImportArticlesBatch method.
 - We need to specify the Verso API Url to be used.
 - The ImportArticlesBatchInfo object is the one to be be serialize to json object and be sent to the Verso API, this class handles three different properties: UserName, Password and Articles.
 - The first param refers to the Verso UserName to be authenticated while the second param refers to the user Password in the Verso system. Both UserName and Password have to match so that the Verso API can import the articles list.
 - The property Articles of the ImportArticlesBatchInfo  class is where you add the articles to be imported. For this, we created a class called ArticleInfo, this class is in charge of handling every single article object property.
 - Add the ArticleInfo objects that we need to import to the Verso API.
 - Finally we prepare the http client request and do what we need with the response.

Note: For this example we use two third party libraries com.google.gson and org.apache.http. You can find .jar in the Libraries folder on the source code downloaded from GitHub. For more information about this libraries refer to:
 - https://github.com/google/gson
 - https://hc.apache.org/downloads.cgi
