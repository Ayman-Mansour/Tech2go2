package tech2go.example.com.tech2go;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.awt.font.NumericShaper;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static android.graphics.Color.*;


public class RVArrayAdapter_Fragment_Home extends RecyclerView.Adapter<RVArrayAdapter_Fragment_Home.MyViewHolder> {
    private LayoutInflater inflater;
    private List<Information> data = Collections.emptyList();
    private final static int FADE_DURATION = 1000; // in milliseconds
    private Context context;

    private static final int TYPE_FULL = 0;
    private static final int TYPE_HALF = 1;
    private static final int TYPE_QUARTER = 2;

    public RVArrayAdapter_Fragment_Home(Context context, List<Information> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    /*@Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View itemView =
                inflater.inflate(R.layout.custom_systems_list, parent, false);
        itemView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                final int type = viewType;
                final ViewGroup.LayoutParams lp = itemView.getLayoutParams();
                if (lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                    StaggeredGridLayoutManager.LayoutParams sglp =
                            (StaggeredGridLayoutManager.LayoutParams) lp;
                    switch (type) {
                        case TYPE_FULL:
                            sglp.setFullSpan(true);
                            break;
                        case TYPE_HALF:
                            sglp.setFullSpan(false);
                            sglp.width = itemView.getWidth() / 2;
                            break;
                        case TYPE_QUARTER:
                            sglp.setFullSpan(false);
                            sglp.width = itemView.getWidth() / 2;
                            sglp.height = itemView.getHeight() / 2;
                            break;
                    }
                    itemView.setLayoutParams(sglp);
                    final StaggeredGridLayoutManager lm =
                            (StaggeredGridLayoutManager) ((RecyclerView) parent).getLayoutManager();
                    lm.invalidateSpanAssignments();
                }
                itemView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });

        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }*/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = inflater.inflate(R.layout.custom_home_list, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder viewHolder, int position) {
        final Information current = data.get(position);
//        viewHolder.textView.setText(current.icon_lable);
        final int TransitionPosition = position + 1;
        viewHolder.imageView.setImageResource(current.icon_id);
        Random random = new Random();
//        int colredid = 0;
//        colredid = random.nextInt(5);
        if (position == random.nextInt(position+1) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#FFBA68C8"));
        }
        if (position == random.nextInt(position+2) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#FF0D47A1"));
        }
        if (position == random.nextInt(position+3) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#214F4B"));
        }
        if (position == random.nextInt(position+4) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#FFD32F2F"));
        }
        if (position == random.nextInt(position+5) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#FF5C6BC0"));
        }if (position == random.nextInt(position+6) ) {
            viewHolder.HomeCardView.setBackgroundColor(Color.parseColor("#9e9d24"));
        }
        /*switch (position ) {
            case 1:
            case 3:
                viewHolder.HomeCardView.setBackgroundColor(RED);
            case 0:
            case 2:
                viewHolder.HomeCardView.setBackgroundColor(YELLOW);
//            default:
//                //never gonna happen
//                viewHolder.HomeCardView.setBackgroundColor(BLACK);
        }*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            viewHolder.imageView.setTransitionName("accidant");
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    Intent intent = new Intent(inflater.getContext(), SubSystemActivity.class);
                    ActivityOptionsCompat options = ActivityOptionsCompat.
                            makeSceneTransitionAnimation((Activity) inflater.getContext(), viewHolder.imageView,
                                    viewHolder.imageView.getTransitionName());

                    //view.setTransitionName(getString(R.string.transition_name) + 1);

                    intent.putExtra("awareness_" + TransitionPosition, "");
//                    Toast.makeText(inflater.getContext(), view.getTransitionName(), Toast.LENGTH_LONG).show();

                    inflater.getContext().startActivity(intent, options.toBundle());
                } else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Intent intent = new Intent(inflater.getContext(), SubSystemActivity.class);
                    intent.putExtra("awareness_" + TransitionPosition, "");
                    inflater.getContext().startActivity(intent);
                }

//                if (viewHolder.textViewDes.getText() == "") {
//                    viewHolder.textViewDes.setText(current.icon_description);
//                }else{
//                    viewHolder.textViewDes.setText("");
//                }

            }
        });
//        setFadeAnimation(viewHolder.itemView);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView textViewDes;
        public ImageView imageView;
        public CardView HomeCardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            HomeCardView = (CardView) itemView.findViewById(R.id.home_custom_row);
//            textView = (TextView) itemView.findViewById(R.id.section_label);
//            textViewDes = (TextView) itemView.findViewById(R.id.section_description);
            imageView = (ImageView) itemView.findViewById(R.id.section_icon_system);
        }
    }

    private void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }
    /*private void setScaleAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }*/
}
