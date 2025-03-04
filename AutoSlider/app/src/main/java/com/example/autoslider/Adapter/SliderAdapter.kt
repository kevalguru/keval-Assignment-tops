package com.example.autoslider.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.autoslider.Model.Item
import com.example.autoslider.databinding.IntroSliderLayoutBinding

class SliderAdapter(var context: Context , var itemList: MutableList<Item>) : PagerAdapter() {

    private lateinit var binding: IntroSliderLayoutBinding

    override fun getCount(): Int {
        return itemList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        binding = IntroSliderLayoutBinding.inflate(LayoutInflater.from(context) , container , false)

        var item = itemList[position]

        binding.ivThumbnail.setImageResource(item.image)

        container.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View)
    }
}