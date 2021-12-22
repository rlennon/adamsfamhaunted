# Newman Actions - setup instructions


With the existing pipeline currently focusing on Java code for the purpose of JUnit testing and Maven builds, there is currently no code that could be tested using a tool such as Postman. However, should code be implemented in the future that contains a database connection or associated HTTP requests, this code could be automatically tested upon pushing to the repository by using the built-in version of Postman available through Github Actions, known as Newman. The steps for setting up the Newman Action are as follows:


### Newman - setup instructions


1. Within Postman, choose the collection of tests that you wish to run against your repository's code and export them
2. Upload these tests to the respository you are going to use Newman in
3. Copy the URL to the collection of Postman tests within your Github repository
4. Using the Actions tab, set up a new workflow within Github Actions
5. Using the search bar on the right, search the Github Marketplace for the Newman Action and select it
6. Copy and paste the code shown into your current workflow's .yml file 
7. Add the URL to the collection of tests contained in your repository to Newman's "collection:"  section of the .yml file 


By including a link to a collection of Postman tests contained within your repository, you can quickly and easily tell the Newman tool where your tests are kept so they can be ran every time the repository is edited.