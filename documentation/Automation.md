# Automation

## What is a DevOps pipeline?
> a set of tools and automated processes utilized by the software engineering team to compile, build, and deploy code

+ Enables companies to rapidly develop, test, and deploy new code on an ongoing basis
+ Should **automate** software delivery/testing, reducing manual work

*(pagerduty.com, [How to Build a DevOps Pipeline: A Beginner’s Guide](https://www.pagerduty.com/resources/learn/what-is-a-pipeline-in-devops-and-how-to-build/))*

<br>

A good DevOps pipeline should have the following:

1. A CI/CD framework
2. Source control management.
3. Automation tools
4. Code testing framework

*(snyk.io, [Key Components of the DevOps Pipeline](https://snyk.io/learn/devops-pipeline-and-tools/))*

<br>

## CI/CD (continuous integration/continuous delivery) framework
+ A modern software development practice in which incremental code changes are made frequently and reliably
+ Within software, CI/CD refers to the automation that **enables incremental code changes from developers’ desktops to be delivered quickly and reliably to production**


> **Continuous integration (CI) =** an automated process of making checks to small changes within code; **performed as code is being written**

> **Continuous delivery (CD) =** the automated delivery of completed code to environments like testing and development; **performed once code is complete**


+ CI/CD also ties into **DevSecOps**, which ensures that security measures are integrated into the DevOps workflow; any automated testing/deployment will therefore be more secure when CI/CD is implemented correctly
+ In order to successfully implement and run a CI/CD pipeline, organizations need tools to prevent points of friction that slow down integration and delivery

<br>

![CI/CD diagram](https://www.synopsys.com/content/dam/synopsys/sig-assets/images/cicd.svg.imgo.svg)


*(synopsys.com, [What is CI/CD](https://www.synopsys.com/glossary/what-is-cicd.html))*

<br>

In terms of CI/CD tools that could be used in a project, there are many options available, including but not limited to:
+ Jenkins
+ GitHub Actions 
+ Azure DevOps
+ CircleCI
+ TravisCI
+ Bamboo

When researching how we could implement automation from our repository for this project, there were two tools that we found particularly interesting - **GitOps** and **GitHub Actions**.

<br>

## GitOps
> **GitOps =** a set of practices to manage infrastructure and application configurations using Git

+ Gives you the tools and framework to take DevOps practices (i.e. collaboration, CI/CD, version control) and apply them to infrastructure automation and application deployment
+ Uses Git pull requests to automatically manage infrastructure provisioning and deployment
+ The Git repository contains the entire state of the system so that the trail of changes to the system state are visible and auditable

*(redhat.com, [What is GitOps?](https://www.redhat.com/en/topics/devops/what-is-gitops#what-is-gitops))*

Within GitOps, there are two main methods of deploying your code:

#### Push-based approach

![GitOps push-based deployment approach](https://verifa.io/images/blogs/2021-06-14/gitops-blog-diagram-1-white-04.png)

In this approach, changes are pushed to the target environment as a part of continuous deployment. However, since this gives the CI/CD tool permission to write to your environment, it is not the most secure option available.

#### Pull-based approach

![GitOps pull-based deployment approach](https://verifa.io/images/blogs/2021-06-14/gitops-blog-diagram-2-white-05.png)

In this approach, there is an agent/proxy/operator running inside your target environment which pulls and deploys changes to itself from a version control system. Since you do not have to manage credentials or access control for deploying changes to the target environment, this is arguably the more secure approach when using GitOps for CI/CD automation.

*(verifa.io, [GitOps: All you need is Git (and Continuous Deployment)](https://verifa.io/insights/gitops-all-you-need-is-git-and-continuous-deployment/))*

<br>

## GitHub Actions
> **GitHub Actions =** allows you to set up a CI/CD workflow using a configuration file in your Github repo; can be used to compile, test, and deploy code

*(freecodecamp.org, [What are Github Actions and How Can You Automate Tests and Slack Notifications?](https://www.freecodecamp.org/news/what-are-github-actions-and-how-can-you-automate-tests-and-slack-notifications/#what-are-github-actions))*

+ Actions are **event-driven**, meaning that you can run a series of commands after a specified event has occurred; they are combined into steps to create a job
+ Made up of various other features such as:
  + **Workflows -** automated procedures you can add to your repository
  + **Events -** a specific activity that triggers a workflow
  + **Jobs -** a set of steps that execute on the same runner
  + **Step -** an individual task that can run commands in a job
  + **Runner -** a server that has the GitHub Actions runner application installed; you can use your own or use one hosted by GitHub
  
When using GitHub Actions, the typical process of execution may look like this:

![GitHub Actions execution](https://docs.github.com/assets/images/help/images/overview-actions-design.png)

*(docs.github.com, [Understanding GitHub Actions](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions))*