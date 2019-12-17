

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

4. If you want setting language any activity extend `AppCompatActivityBase` on it.

```
class MainActivity : AppCompatActivityBase() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        `//call funtion `setNewLocale("...")` to change language.`
        change_language_th_button.setOnClickListener {
            setNewLocale("TH")
        }
        change_language_en_button.setOnClickListener {
            setNewLocale("EN")
        }
        ...
        
    }
    
}
```

        


![Alt Text](https://media.giphy.com/media/vFKqnCdLPNOKc/giphy.gif)

