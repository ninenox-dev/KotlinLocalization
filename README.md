<a href="https://github.com/nisit15/KotlinMultiLanguage"><img src="https://camo.githubusercontent.com/b8444ae133e24073026aaac5f84b23a896fa8dd2/68747470733a2f2f7472617669732d63692e6f72672f6b697474696e756e662f6675656c2e7376673f6272616e63683d6d6173746572" alt="Build Status" style="max-width:100%;"></a> <a href="https://www.ninenox.com"><img src="https://camo.githubusercontent.com/eb54d63dadf4ca40382d1b11f736ec31a24e0aff/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f616e64726f69642d737570706f72742d677265656e2e737667" alt="Android" style="max-width:100%;"></a>

# KotlinLocalization
Android kotlin library for change ui language in android application at runtime.

![Alt Text](https://media.giphy.com/media/VEcDJtSPLjQ6X3NRbs/giphy.gif)


# Installation
On your module app `build.gradle` add
```
dependencies {
     implementation 'com.ninenox.kotlinlocalemanager:kotlin-locale-manager:1.0.0'
}
```

# Getting Started

1. Create class and extend `ApplicationLocale`.

```
class App : ApplicationLocale() {

}
```

2. In `AndroidManifest.xml`
```
<application
        android:name=".App"
        ...
        />
```

3. In folder `res` add new locale.

```
values-th
   - strings.xml
values-en
   - strings.xml
```

4. In any `Activity` extend `AppCompatActivityBase` on it.

```
class MainActivity : AppCompatActivityBase() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        ...
        
    }
    
}
```
5. Call funtion `setNewLocale("...")` for set current language and refresh ui.
```

setNewLocale("EN") // Sample "EN","TH","DE"...
        
```

6. Get current code language string.
```
LocaleManager(this).language.toString() // "EN"
```
        


![Alt Text](https://media.giphy.com/media/vFKqnCdLPNOKc/giphy.gif)

