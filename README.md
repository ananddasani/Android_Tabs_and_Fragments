# Android_Tabs_and_Fragments
Partial WhatsApp UI Clone Using Tabs Controller and Fragments

---

**NOW THIS FragmentPagerAdapter IS DEPRECATED SO USE FragmentStateAdapter <br>
[Visit This for same](https://github.com/ananddasani/Android_Tabs_And_Fragment_NEW)**

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

---

# Code

#### FragmentAdapter.java
```
//--------------------Deprecated----------------------
public class FragmentAdapter extends FragmentPagerAdapter {

    int tabCount = 0;

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {

        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 : return new FragmentChat();
            case 1 : return new FragmentStatus();
            case 2 : return new FragmentCalls();

            default: return  new FragmentChat();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";

        switch (position){
            case 0: title = "CHATS"; break;
            case 1: title = "STATUS"; break;
            case 2: title = "CALLS"; break;

            default: title = "Not Specified"; break;
        }
        return title;
    }
}
```

#### MainActivity.java
```
TabLayout tabLayout;
ViewPager viewPager;

viewPager = findViewById(R.id.viewPager);
viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), 3)); // Deprecated


tabLayout = findViewById(R.id.tabLayout);
tabLayout.setupWithViewPager(viewPager);
```

# App Highlight
![Fragment and Tabs App](https://user-images.githubusercontent.com/74413402/192095584-7fae5fdf-c633-4d3c-8fac-9811c6945bf3.png)
![Fragment and Tabs Code](https://user-images.githubusercontent.com/74413402/192095589-fc900e26-e734-402b-82f6-288b68e71c3a.png)

