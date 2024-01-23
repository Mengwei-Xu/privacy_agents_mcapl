# Privacy Agents in BDI Using MCAPL Framework

This is the artifact of AAMAS accepted paper titled **"Safeguard Privacy for Minimal Data Collection with Trustworthy Autonomous Agents"**. The following is the list of re-produciability instruction. 


## Files 

This repository contains four folders that are organised in a way that exactly corresponds to the content in the paper. For example, the folder health_app contains the relevant files for the illustrative example of health app used in the paper, whereas figure_n for the experiments presented in the figure n (n=2,3,4).

## MCAPL

The reproducation of the example and the experiments are tightly dependent on the usage of MCAPL framework. Please download the latest stable version at https://github.com/mcapl/mcapl. Please be aware of that it can be a little tricky to set up MCAPL. That said, MCAPL does provide quite detailed mannual in the latex form which can be found at https://github.com/mcapl/mcapl/tree/master/doc/manual. If you are stuck, please do not hesitate to contact Dr Louise Dennis or me at mengwei.xu@newcastle.ac.uk.

## Preparation

To make the life easier, it is recommend to follow the following path setting up unless you want to go into each file to update the path.  Once you have successfully installed MCAPL, please download this repository and put four folders, namely /figure_2, /figure_3, /figure_4, and /health_app, under the dirctory of */home/mengwei/mcapl/src/examples/gwendolen/privacy*. So you will have the correct path for each folder, such as */home/mengwei/mcapl/src/examples/gwendolen/privacy/figure_2*. 
 

## Run the health_app example

In the folder of *health_app*, there are five files. A short commentary is as follows. *health_app_agent.gwen* is the design of privacy agent of BDI style using Gwendolen synatx. *health_app_agent.psl* contains the list of the properties we may want to check. *HealthAppVerificationEnv.java* is the implementation of the environment in which the agent is situated. To simuate the agent, we can run the file *health_app_agent.ail* using AIL class defined in MCAPL. Finally, to verify the agent, we can run the file *health_app_agent.jpf* using JPF class defined in MCAPL. The similar file structure can be found in the rest of folders for the experiments, expect with synthestic data.  

## Note
Once again, for any interested researchers/readers/developers, if any question, please be in touch. We welcome any potential colloboration. :) 