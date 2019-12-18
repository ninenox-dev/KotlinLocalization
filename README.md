<img src="https://camo.githubusercontent.com/60ff9343605609fe208bb12df18d0a566658f316/68747470733a2f2f696d672e736869656c64732e696f2f636f636f61706f64732f762f5278416c616d6f666972652e7376673f7374796c653d666c6174" alt="Version" data-canonical-src="https://img.shields.io/cocoapods/v/RxAlamofire.svg?style=flat" style="max-width:100%;">

# KotlinMultiLanguage
Android kotlin library for change ui language in android application at runtime.

![Alt Text](https://media.giphy.com/media/VEcDJtSPLjQ6X3NRbs/giphy.gif)


# Installation

```
implementation 'com.ninenox.kotlinlocalemanager:kotlin-locale-manager:1.0.0'
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

