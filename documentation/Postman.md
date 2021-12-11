# Postman & its possible uses in our project

As we move into the later stages of our project, we will need to think about both the testing and release aspects of our pipeline. In terms of testing, there are multiple methods with which our project’s code could be tested each time it is compiled or pushed to the GitHub repository – one of these includes the software **Postman**. 

With Postman, it is possible to create collections of various HTTP-based requests to check for things like successful connections, the speed of data transfer, and so on. 

![An example of the Postman interface](https://blog.postman.com/wp-content/uploads/2020/07/Postman-for-the-web.png)

*An example of the Postman interface*

For our project, we could use URLs linking to the code sources in our repository to test that the code is working as intended, and that there are no errors that need to be fixed – doing this through Postman would save the team having to write additional files and code to test these kinds of features and bugs.

### Command line testing using Postman & the newman tool

Another aspect of Postman that could prove very useful to our project is using its built-in CLI tool, newman, to aid with our CI/CD deployment (as documented [here](https://dev.to/scampiuk/using-postman-s-cli-tool-for-api-testing-newman-5fn1) by Chris Williams). Alongside the CI/CD tool we will use (which will most likely be GitHub Actions), using this CLI tool would allow us to run our tests from the command line, and test our code in real time as it is pushed to GitHub.

![An example of command line testing configured in Postman](https://res.cloudinary.com/practicaldev/image/fetch/s--KyOAFtni--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://thepracticaldev.s3.amazonaws.com/i/b1aoyzq323um2f2nivtl.png)

*An example of command line testing configured in Postman & newman*