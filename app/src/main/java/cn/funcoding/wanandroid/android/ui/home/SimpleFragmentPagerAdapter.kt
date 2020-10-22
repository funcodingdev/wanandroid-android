package cn.funcoding.wanandroid.android.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SimpleFragmentPagerAdapter(
    fm: FragmentManager,
    private val fragmentList: List<Fragment>,
    private val titles: List<String>,
    behavior: Int = BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) :
    FragmentPagerAdapter(fm, behavior) {

    init {
        require(titles.size == fragmentList.size) {
            "Fragment的数量必须和标题的数量匹配"
        }
    }

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getPageTitle(position: Int): CharSequence? = titles[position]

    override fun getItemId(position: Int): Long = fragmentList[position].hashCode().toLong()
}