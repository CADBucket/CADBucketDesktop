package io.github.cadbucket;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
import imgui.flag.ImGuiConfigFlags;

public final class CADBucketApp extends Application {
    @Override
    public void configure(Configuration config) {
        config.setTitle("CADBucket");
    }

    @Override
    protected void initImGui(Configuration config) {
        super.initImGui(config);
        ImGui.getIO().setConfigFlags(ImGuiConfigFlags.DockingEnable);
    }

    @Override
    public void process() {
        ImGui.dockSpaceOverViewport();
        ImGui.showDemoWindow();
    }

    public static void main(String[] args) {
        launch(new CADBucketApp());
    }
}
