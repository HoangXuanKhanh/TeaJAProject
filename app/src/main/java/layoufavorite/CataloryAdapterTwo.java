package layoufavorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClicItemCatalory1;
import com.example.teaja.myInterface.IcClickItemCatalory2;

import java.util.List;

public class CataloryAdapterTwo extends RecyclerView.Adapter<CataloryAdapterTwo.ViewHolder> {

    List<Catalory2> catalory2List;
    IcClickItemCatalory2 icClickItemCatalory2;

    public void CataloryAdapterTwo(List<Catalory2> catalory2List, IcClickItemCatalory2 catalory2) {
        this.catalory2List = catalory2List;
        this.icClickItemCatalory2 = catalory2;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CataloryAdapterTwo.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_catalorytwo, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CataloryAdapterTwo.ViewHolder holder, int position) {
        Catalory2 catalory2 = catalory2List.get(position);

        holder.imgCatalory2.setImageResource(catalory2.getResourceID());
        holder.tvName.setText(catalory2.getName());
        holder.layoutCaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icClickItemCatalory2.setOnClickItemListener2(catalory2);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(catalory2List != null){
            return catalory2List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutCaty;
        private ImageView imgCatalory2;
        private TextView tvName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutCaty = itemView.findViewById(R.id.ln_Caty);
            imgCatalory2 = itemView.findViewById(R.id.img_catalorytwo);
            tvName = itemView.findViewById(R.id.tv_catalory2);
        }
    }
}
