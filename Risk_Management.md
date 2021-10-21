# Risk Management Overview

## What is Risk Management?

* Risk - is an uncertain event that may have positive or negative impact and affects every aspect of the project.

* Management - is a process of identifying and migrating the risk.
	* Affects - Schedule, Scope, and Budget.

* Risks present in the Project Management
	* Plan Risk Management
	* Identify Risk
	* Qualitative Risk Analysis
	* Quantative Risk Analysis
	* Plan Risk Response
	* Monitor Control Risk

## Oveview of the different risks present in Risk Management

### Plan Risk Management
* Analysis and decision making to implement risk management.

* Stakeholders must be involved in planning in risk management.
	* Schedule Risk.
	* Cost Risk.
	* Quality Risk.
	* Scope Risk.
	* Resource Risk.
	* Customer Satisfaction Risk.

### Identify Risk

* Which risk has more probability of affecting the project?
	* Information Gathering.
	* Checklist Analysis - involves a deep analysis of the requirements and the potential risks associated.

### Qualitative Risk Analysis

* Assess impact and likelihood of identified risks - the goal is measure both the likelihood of occuring and the impact it will have on the overall schedule.

### Quantitative Risk Analysis

* Data Gathering
	* Direct approach.
	* Dragramatic - involves use cases.

* Probability Distribution.

* Modeling Techniques.

### Plan Risk Response

* Eliminate threats before they happen.

* Negative risk or threat
	* Avoid, transfer, mitigate, accept.

* Positive risk or opportunity
	* Exploit, share, enhance.

### Monitor and Control Risk

* Risk Reassessment.
	
* Risk Audit - examine the effectiveness of plan risk response.

* Trend Analysis - monitors project performance. 

# The Repeating Cycle of Risk Management

> Control monitor -> Identify -> Assess -> Evaluate -> Repeat

# Calculating Risk Formula

* Risk Score = risk probability * risk impact

# OWASP Top 10 and its relation to Risk Management

* Thread agents - this element describes which users to watch out for which pose a threat to your application.

* Attack vectors and scenarios - describes which kinf of attacks are to be expected.

* Detectability - answers the question of how easy the risk/weak spot can be found by attackers.

* Exploitability - describes how widespread the vulnerability is and how easy is to exploit it.

* Impacts - this element describes the impact on the business and technical architecture.

# The difference between **Risks** and **Threats**

* Threats are specific - what could go wrong with your system if a person or a process exploits it and to what and whom you have to protect yout system from.

* Risks are abstract - its the systems' exposure to threats.

* Question - what (given the costs and trade-offs) can/should we do to reduce the exposure of the risks to threats.

# Ways to deal with risks (expanded)

* Accept it - this is a very common strategy which states **Accept the risk and move on**.
The team must be prepared to deal with theconsequences in case something bad does happen.
We need to monitor the feature which has the known risk, react to incident in a correct
and timely manner, and be able to fix it within short time-frame.

* Avoid it - we should't use unsafe or unproven technology. The same applies to legacy technology which is poorly maintained.
Sometimes is better to disable a feature or simplify it to avoid the risk.
The team should focus on building simply by creating things in a simplay way which also speeds up
(security) reviews.

* Reduce it - this strategy activelly reduces risks. Testing the application, scanning source code and
dependancies for vulnerabilities and more.

* Share or transfer it - although a risk does not dissapear magically when it is shared or outsourced to a third party,
it can help to reduce it. 

# Make it Visible (risks continued)

**The strategies below will only work for visible risks**

> Create user stories on the backlog which are about reducing risks and
put them under a specific category or link them to an epic so that thet can be
browsed quickly.

> Scan the source code and dependencies in the CI/CD (Continious Integration, Continious Delivery/Deployment) pipelines
every time there is a commit. That way you can scan for known vulberabilities, exposed secrets, invalid licenses
and outdated packages. The results should be made accessible for everyone to increase the learning process.

# Tools to help Risk Management

- [Snyk](https://www.snyk.io)

* Snyk is an open-source automatic software which can help to fix vulnerabilities
in our code, dependencies, containers and infrastructure as a code.

- [WhiteSource](https://www.whitesourcesoftware.com/software-composition-analysis-lp/?utm_origin=ad&utm_from=adwords&utm_pcampaign=fs.competitors.snyk.geo-2.search&utm_gen=searched+term%3Asnyk+alternative&gclid=cjwkcajwn8slbhayeiwahntjbtgu5o_szranrchchjuuqfzx2ku3uzx_46bd0vekgtvitw65npgjmboc9n8qavd_bwe)

* WhiteSource is another open-source security and licence compliance software.

 

 

