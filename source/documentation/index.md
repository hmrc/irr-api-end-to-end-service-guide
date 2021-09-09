---
title: Interest Restriction Return (IRR) End-to-End Service Guide
weight: 1
description: Software developers, designers, product owners or business analysts. Integrate your software with IRR API
---

# Interest Restriction Return (IRR) end-to-end service guide

Version 0.5 issued 16 June 2021
***

## Overview
<!-- Section owner: IRR Programme -->

When calculating how much UK corporation tax a company or group has to pay, there's a limit to the amount of tax relief allowed for deducting interest and other financing costs.

On 1st April 2017, new Corporate Interest Restriction (CIR) legislation came into effect. New rules were introduced to limit tax deduction for interest expense and other similar financing costs.

If a group has more than £2 million (per annum) in net interest expense, they may be subject to a restriction under the rules. If so, it is usually beneficial for the group to appoint a reporting company (within twelve months of the end of the period of account), to submit returns on behalf of the group. This may be the case even where the group only consists of one company.

The appointed reporting company must then submit a group level interest restriction return on behalf of the group. The deadline for submitting the return is usually twelve months from the end of the CIR period of account.

This guide explains how you can use the Interest Restriction Return API with your software

It is written for software developers, designers, analysts, managers and others involved with creating or integrating software that connects to this API.

The API supports the following functions:

* Revoke an existing Reporting Company from submitting Interest Restriction Returns
* Appoint a new Reporting Company for submitting Interest Restriction Returns
* Submit an Interest Restriction Return (full)
* Submit an Interest Restriction Return (abbreviated)

For more information about how to develop your own client applications, including example clients for this API, see [Tutorials](https://developer.service.hmrc.gov.uk/api-documentation/docs/tutorials).

## Business rules and error messages

You can open the business rules and error messages for each journey. They are formatted in CSV or Microsoft Excel (xlsx).

### Business rules

* Revoke an existing Reporting Company from submitting Interest Restriction Returns business rules [<a href="downloads/business-rules/Revoke Business Rules.csv" download>csv</a> | <a href="downloads/business-rules/Revoke Business Rules.xlsx" download>xlsx</a>]
* Appoint a new Reporting Company for submitting Interest Restriction Returns business rules [<a href="downloads/business-rules/Appoint Business Rules.csv" download>csv</a> | <a href="downloads/business-rules/Appoint Business Rules.xlsx" download>xlsx</a>]
* Submit an Interest Restriction Return (full) business rules [<a href="downloads/business-rules/Full Return Business Rules.csv" download>csv</a> | <a href="downloads/business-rules/Full Return Business Rules.xlsx" download>xlsx</a>]
* Submit an Interest Restriction Return (abbreviated) business rules [<a href="downloads/business-rules/Abbreviated Return Business Rules.csv" download>csv</a> | <a href="downloads/business-rules/Abbreviated Return Business Rules.xlsx" download>xlsx</a>]

### Error messages

* Revoke an existing Reporting Company from submitting Interest Restriction Returns error messages [<a href="downloads/error-messages/Revoke Errors.csv" download>csv</a> | <a href="downloads/error-messages/Revoke Errors.xlsx" download>xlsx</a>]
* Appoint a new Reporting Company for submitting Interest Restriction Returns error messages [<a href="downloads/error-messages/Appoint Errors.csv" download>csv</a> | <a href="downloads/error-messages/Appoint Errors.xlsx" download>xlsx</a>] 
* Submit an Interest Restriction Return (full) error messages [<a href="downloads/error-messages/Full Return Errors.csv" download>csv</a> | <a href="downloads/error-messages/Full Return Errors.xlsx" download>xlsx</a>]
* Submit an Interest Restriction Return (abbreviated) error messages [<a href="downloads/error-messages/Abbreviated Return Errors.csv" download>csv</a> | <a href="downloads/error-messages/Abbreviated Return Errors.xlsx" download>xlsx</a>]

## User restricted endpoints

This application uses user restricted endpoints. This means that we require specific authorisation from the user to grant authority to your application to interact with HMRC on their behalf, without sharing their access credentials.

For in depth information about user restricted endpoints, together with examples on how to integrate with them, please visit HMRC’s developer hub guidance on [User Restricted Endpoints](https://developer.service.hmrc.gov.uk/api-documentation/docs/authorisation/user-restricted-endpoints)

## Related API documentation
<!--- Section owner: IRR Programme --->

* [Interest Restriction Return (IRR) REST API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/interest-restriction-return/1.0)
* [Create Test User API](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/api-platform-test-user/1.0)

## Troubleshooting

<ins>What to do when a group company has more than 3 relevant accounting periods</ins>   

You need to follow these steps if: the reporting company is submitting a full Interest Restriction Return (IRR), the group is subject to a restriction for this period of account and one of the group companies has more than 3 relevant accounting periods.   

1. When completing the group company’s details, the reporting company should submit the correct end dates and allocated restrictions (disallowance) for AP1 and AP2.   
2. For AP3, the reporting company should provide the end date of the group company’s last relevant accounting period (whether that would be AP4, AP5 or so on) and the disallowance to AP3 and the remaining APs.   
3. The reporting company should indicate that the details for the group company in question are estimated and the reason why in the text box. The reporting company should explain in the textbox that the group company has more than 3 relevant APs, and provide the end dates and disallowance for AP3 and AP4 (and so on, if needed).   

The reporting company could also include a statement that it does not intend to file a revised return to replace this estimate for completeness.   

<ins>What to do when a group company has more than 3 relevant accounting periods and the AP4 end date is greater than 12 months from the AP2 end date</ins>   
 
You need to enter the AP4 end date into the companyEstimateReason field if the AP4 end date is greater than 12 months from the AP2 end date, and the AP3 end date is already populated.   

The restriction amount for AP4 (if applicable) must be added to the disallowanceAP3 field (combined with AP3 disallowance). The companyEstimateReason field should then detail how the disallowance is split between AP3 and AP4.   

## Changelog
<!--- Section owner: IRR Programme --->

### Version 0.5

16 June 2021

What changed:

* Alterations to overview
* Update business rules & error messages

### Version 0.4

3 June 2021

What changed:

* Add more information to overview
* Add XLSX download option
* Update content of error messages and business rules

### Version 0.3

28 May 2021

What changed:

* Add content to user restricted endpoints section

### Version 0.2

24 May 2021

What changed:

* Add overview
* Add business rules CSVs
* Add error messages CSVs

### Version 0.1

5 March 2020

What changed:

* Initial Draft Service. Hello World for IRR.
