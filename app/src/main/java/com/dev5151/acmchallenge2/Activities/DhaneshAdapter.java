package com.dev5151.acmchallenge2.Activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dev5151.acmchallenge2.R;

import java.util.ArrayList;

public class DhaneshAdapter extends RecyclerView.Adapter<DhaneshAdapter.ViewHolder> {
    public Context context;
    private ArrayList<UserInfo> usersInfo;

    public DhaneshAdapter(Context context, int resource, ArrayList<UserInfo> info) {
        usersInfo = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameText.setText(usersInfo.get(position).getmName());
        holder.usernameText.setText(usersInfo.get(position).getmUsername());
        holder.mailText.setText(usersInfo.get(position).getmEmailId());
        holder.ageText.setText(usersInfo.get(position).getmAge());
        holder.regText.setText(usersInfo.get(position).getmRegNo());
        holder.collegeText.setText(usersInfo.get(position).getmCollege());
        holder.branchText.setText(usersInfo.get(position).getmBranch());
        holder.phoneText.setText(usersInfo.get(position).getmPhoneNo());

    }

    @Override
    public int getItemCount() {
        return usersInfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, usernameText, mailText, ageText, regText, collegeText, branchText, phoneText;

        public ViewHolder(View view) {
            super(view);
            nameText = view.findViewById(R.id.name_display);
            usernameText = view.findViewById(R.id.username_display);
            mailText = view.findViewById(R.id.emailid_display);
            ageText = view.findViewById(R.id.age_display);
            regText = view.findViewById(R.id.reg_display);
            collegeText = view.findViewById(R.id.college_display);
            branchText = view.findViewById(R.id.branch_display);
            phoneText = view.findViewById(R.id.phone_display);


        }
    }
}
