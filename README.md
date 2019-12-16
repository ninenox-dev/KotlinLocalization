# KotlinMultiLanguage
Android kotlin change language at runtime.

# Installation

```
implementation 'com.ninenox.kotlinlocalemanager:kotlin-locale-manager:1.0.0'
```

# Getting Started

Create class and extend ApplicationLocale.

```
class App : ApplicationLocale() {

}
```

In AndroidManifest
```
<application
        android:name=".App"
        ...
        />
```

In every activity extend AppCompatActivityBase.

```
class MainActivity : AppCompatActivityBase() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        change_language_th_button.setOnClickListener {
            setNewLocale("TH",true)
        }
        change_language_en_button.setOnClickListener {
            setNewLocale("EN",true)
        }

    }
    
}
```
