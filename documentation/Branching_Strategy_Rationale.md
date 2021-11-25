# ADAMSFAM BRANCHING STRATEGY – RATIONALE
As part of our project to build a DevOps pipeline, one of the main components that had to be decided on amongst all team members was the branching strategy for our GitHub repository. Through collaboration with the team and additional advice from our supervisor, we ended up choosing a branching strategy using three branches: Main, ReleaseCandidate and Dev (which can also include multiple Task branches). 

*The diagram of this branching strategy can be found in the Main/documentation folder of our repository.*


Our rationale for choosing these branches as part of our strategy is as follows:

### MAIN
This will be our primary branch, where we will store the final version of components like API documents and any tested software components we have as part of our pipeline. It was decided to have one main branch to avoid confusion & to have a convenient, easily accessible place to store the finalised version of our pipeline elements.



### RELEASE CANDIDATE
This branch was created to contain elements that are near-complete/near-finalised, but will still need final approval before being added to the Main branch. This allows members of the team to push any components to this branch once they have been completed and reviewed, and allow them to be reviewed further before they are fully committed to the final version of our pipeline.



### DEV & TASK
The Dev branch is the branch that we will likely be accessing the most during our pipeline’s development, since this is where we will store anything currently in progress by the team. When a member of the team wants to work on something specific for the project, they can create their own Task branch from the Dev branch, ensuring the existing work added to the Dev branch is not affected. Then, when this work is complete, it can be reviewed by another team member before being merged back into the Dev branch via a pull request. We believe this will ultimately be the most efficient way of developing our project, as well as the most risk-avoidant.