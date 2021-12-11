# Newman Action
As mentioned in previous documentation, Postman is a tool which allows the user to gather multiple tests together and run them simultaneously against code. Should the user wish for this process to be automated, this can be done with the use of **[Newman](https://github.com/marketplace/actions/newman-action)**. 

The Newman Action can be added to a repository that implements a GitHub Actions workflow, allowing for the automated testing of code when it is pushed to or pulled from the repository. It can either be run directly from the command line, or from a GitHub Action. If you already have collections of tests coded within Postman, they can be accessed by the Newman tool in a few ways:

1. By exporting your collections as a JSON file, pushing it into your repository & telling Newman where the JSON file is
2. If the file can be accessed via a URL, by giving Newman this URL
3. By using [Postman's own API](https://docs.api.getpostman.com/?version=latest)

Regardless of the method you choose, the reference to your Postman collection will be inserted into the GitHub Actions Workflow file.

#### How could this be used?
For larger-scale projects that would be likely to implement an automated workflow, the Newman tool would save a lot of time and resources that could likely be used on other areas of the project. Thanks to Postman's GUI that allows for the quick & simple writing and collecting of tests, using a tool such as Newman would save the time that would usually be spent writing individual tests in code. It would also cut down on the time many developers spend writing individual pages or programs to test the input and output of their software, instead allowing them to quickly run a test to make sure the code is functioning as intended.