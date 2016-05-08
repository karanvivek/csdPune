Feature: Place order for a meal

As a customer
I want to place order
So that I can get what I have ordered

Scenario: Customer should be able to add food items in a cart.

	Given customer is browsing the menu,
	When customer selects a particular item or group of items,
	Then I should be able to add that item in my cart

@wip
Scenario: Customer should be able to view and modify the cart items.

	Given customer has added items in the cart,
	When customer clicks on view cart,
	Then customer should see those items 
	And he should be able to remove items from the cart
