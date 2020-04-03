package com.taobao.arthas.core.command.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongdewei 2020/4/3
 */
public class CommandVO {
    private String name;
    private String description;
    private String usage;
    private String summary;
    private List<OptionVO> options = new ArrayList<OptionVO>();
    private List<ArgumentVO> arguments = new ArrayList<ArgumentVO>();

    public CommandVO() {
    }

    public CommandVO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CommandVO addOption(OptionVO optionVO){
        this.options.add(optionVO);
        return this;
    }

    public CommandVO addArgument(ArgumentVO argumentVO){
        this.arguments.add(argumentVO);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<OptionVO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionVO> options) {
        this.options = options;
    }

    public List<ArgumentVO> getArguments() {
        return arguments;
    }

    public void setArguments(List<ArgumentVO> arguments) {
        this.arguments = arguments;
    }
}
