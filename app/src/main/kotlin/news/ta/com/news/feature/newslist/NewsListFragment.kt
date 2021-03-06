package news.ta.com.news.feature.newslist

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import news.ta.com.news.R
import news.ta.com.news.databinding.FragmentNewsListBinding

class NewsListFragment : Fragment() {

    private lateinit var binder: NewsListBinder

    companion object {

        val HAS_DETAIL = "news.ta.com.news.feature.newslist.HAS_DETAIL"

        fun newInstance(hasDetail: Boolean): Fragment {
            val fragment = NewsListFragment()
            val bundle = Bundle()
            bundle.putSerializable(HAS_DETAIL, hasDetail)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentNewsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_list, container, false)
        binder = NewsListBinder(this, binding)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binder.bindTo(this)
    }
}