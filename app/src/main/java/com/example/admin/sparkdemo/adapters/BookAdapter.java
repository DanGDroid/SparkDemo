package com.example.admin.sparkdemo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.sparkdemo.R;
import com.example.admin.sparkdemo.activities.MainActivity;
import com.example.admin.sparkdemo.fragments.BookItemFragment;
import com.example.admin.sparkdemo.model.Book;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by Admin on 11/22/2015.
 */
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>{


    private List<Book> books;
    Context context;
    MainActivity mainActivity ;

    public BookAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
        this.mainActivity = (MainActivity)context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int pos) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item,viewGroup,false);

        return new ViewHolder(view,mainActivity );
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int pos) {

        Book book = books.get(pos);
        viewHolder.bindVideoClip(context,book);

    }

    @Override
    public int getItemCount() {

        return books.size();
    }





    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;

        private Book book;

        public ViewHolder(View itemView, final MainActivity mainActivity) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(book != null)
                        mainActivity.changeFragment(BookItemFragment.newInstance());
                }
            });
            imageView = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            title = (TextView) itemView.findViewById(R.id.tv_title);
        }

        public void bindVideoClip(Context context,Book book){

            this.book = book;

            title.setText(book.getTitle());
            String dbg = "";
            Picasso.with(context).load(book.getThumbNail())
                    .placeholder(R.drawable.spark_logo).into(imageView);
        }

    }
}
