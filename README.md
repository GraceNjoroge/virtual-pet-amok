# virtual-pet-amok
Virtual Pets AMOK

Project Map: 

This project takes on a similar design to the Virtual-Pet-Shelter project with the addition of extended child classes for cat, organic dog and robot dog. 

The virtual pet shelter class has methods for feeding all of the pets, giving water to all of the pets, walking the dogs, cleaning the cages, cleaning the litterbox, adopting a pet, and admitting a pet. Calling the feed all and water all methods will decrease their hunger and thirst levels but increase their sleep level and the amount of waste in the dog’s cage and in a cat's litterbox. There is a tick method set for calling for all individual pet tick methods. All virtual pets are stored in a map/collection.

The class virtual pet allows for interaction with each of the animals of creation of an organic cat, an organic dog, and a robot dog. All virtual pets share Health, playing and boredom traits. Boredom will go down if playing gets too high. All pets start out with default stats. Tick method and play method are housed here.

The dog instance variable contains the walk method which increases happiness for all dogs.

The organic cat class contains new instance variables for hunger and thirst. Health is affected when hunger and thirst levels are too low. 

The organic dog class extends the virtual pet class and implements the organic interface which contains the methods for feeding and giving water to all organic pets, and contains new instance variables for hunger, thirst, and amount of waste. Health is affected when hunger/thirst levels are too low and amount of waste is too high. Clean cage method is introduced to reduce the amount of waste in a dogs cage. Walk method also reduces the amount of waste in a cage.

The robot dog class extends the virtual pet class and implements the robotic interface which has method for oiling the pet and contains the new instance variable oil level. If oil level drops too low then health will be affected. Walk method will increase happiness in robot dogs.

The virtual pet shelter app will display a menu for options and the virtual pet status. 
