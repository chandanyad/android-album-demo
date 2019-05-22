It is a kotlin platform based sample app to fetch the data from the API and render it to the RecycleView. 

API URL used - https://jsonplaceholder.typicode.com/albums

The architecture diagram can be found inside the app at the location - app/diagram/AlbumDemoUMLDiagram.png


Module Driven Development approach (MDD) Approach - 
    I had tried to used the MDD approach using the MVP architecture. I tried to split the Model role into further parts. 
    
My modules have 5 parts –

1.	UI – Activity and Fragments (contains only UI, no brainer logic)
2.	Presenter – Responsible for getting the data from model and create view model for UI
3.	Model – This is the part which is responsible for having business logic, communicating with API and string data into  local. It looks 
           like it has more than one responsibly which breaks the SOLID principle. So I decided to reduce the burden from the model and 
           split int into parts, so that it can be maintained & tested easily. 

           a)Domain/Service – This is the core of all module. It has all the logic or brain required by the Album module.     
           b)Repo – This will be responsible for providing data. Either from local or API. This will be further divided into 2 parts.
     
                i.	Local – Responsible for DB handling and cache logic
               ii.	Remote – For API interaction
 
 
Below libraries are used -
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

