Fetching the existing services in an account of PagerDuty using REST API

PagerDutyService class makes the actual call to api

PagerDutyServiceResponse class maps to the actual json response object which is a list of services

Service is a POJO class which represnts a single service of an account. Feel free to extend it to include the attributes as you required from PagerDuty's services response.

App.java : It needs to executed with -apitoken apitokenvalue as parameters

e.g., App -apitoken fgdsfgdskfhd

This token should be generated on PagerDuty portal.
