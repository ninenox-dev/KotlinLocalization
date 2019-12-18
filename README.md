<a href="https://bintray.com/nisit15/kotlin-locale-manager/com.ninenox.kotlinlocalemanager" rel="nofollow"><img src="https://camo.githubusercontent.com/fe89103687fd265c76717416f83287457fd91b74/68747470733a2f2f6170692e62696e747261792e636f6d2f7061636b616765732f6b697474696e756e662f6d6176656e2f4675656c2d416e64726f69642f696d616765732f646f776e6c6f61642e737667" alt="bintray" data-canonical-src="https://api.bintray.com/packages/kittinunf/maven/Fuel-Android/images/download.svg" style="max-width:100%;"></a> <a href="https://www.ninenox.com"><img src="https://camo.githubusercontent.com/eb54d63dadf4ca40382d1b11f736ec31a24e0aff/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f616e64726f69642d737570706f72742d677265656e2e737667" alt="Android" data-canonical-src="https://img.shields.io/badge/android-support-green.svg" style="max-width:100%;"></a>

# KotlinMultiLanguage
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

