The Created a Kotlin sample app to fetch the data from the API and render the data into the RecycleView.
API URL - https://jsonplaceholder.typicode.com/albums

The architecture diagram can be found inside the app at the location - app/diagram/AlbumDemoUMLDiagram.png

Below libraries are used –
 1.	Dagger 2.0 – For dependency Inject
 2.	Retrofit – Used for network handling and API interaction  
 3.	GSON – To parse the API response
 4.	Realm – DB used for storing the data
 5.	Rxjava – For Async data handling
 6.	Kotlin high level methods – let, with, apply, run
 7.	PlantUML – for creating UML diagram


Recommendations for future improvements -
 1.	Encryption - Data store in the DB is not encrypted. We can encrypt the data or encrypt the whole DB. Ream provide that option
 2.	Login Auth - The API call can be secure using auth protocol.
 3.	MinSDK Version is 21 supports restrict few of the Java feature usage.
 4.	Analytics – To get the user behaviour on the screen
 5.	Crash Report – We can integrate tool to get the crash logs using tools – HockeyApp, crashlytics.


