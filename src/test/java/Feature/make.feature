Feature: Automate make my trip application                                                                                                                                                                  Feature: Automate make my trip

Scenario: booking cheapest bus tickets
Given User Launch the Make My trip application
When user select source and destination
When user pick the date and search the buses
When user filter the bus seats
When user select the cheapest bus and select seats
And user enter the traveller details and confirm the booking 