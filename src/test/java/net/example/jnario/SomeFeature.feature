package net.example.jnario



Feature: SomeFeature
	
	As a magician
	I want to use nothing
	In order to get something
	
	Scenario: Finding something
		
		int nothing
	
		Given a nothing 
		
			nothing = 0
		
		When I increment nothing
		
			nothing = nothing+1;
			
		Then it should create something
		
			nothing should be 1
			
