package com.jsh.erp.datasource.entities;

public class AssetCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_assetcategory.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_assetcategory.assetname
     *
     * @mbggenerated
     */
    private String assetname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_assetcategory.isystem
     *
     * @mbggenerated
     */
    private Byte isystem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_assetcategory.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_assetcategory.id
     *
     * @return the value of jsh_assetcategory.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_assetcategory.id
     *
     * @param id the value for jsh_assetcategory.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_assetcategory.assetname
     *
     * @return the value of jsh_assetcategory.assetname
     *
     * @mbggenerated
     */
    public String getAssetname() {
        return assetname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_assetcategory.assetname
     *
     * @param assetname the value for jsh_assetcategory.assetname
     *
     * @mbggenerated
     */
    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_assetcategory.isystem
     *
     * @return the value of jsh_assetcategory.isystem
     *
     * @mbggenerated
     */
    public Byte getIsystem() {
        return isystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_assetcategory.isystem
     *
     * @param isystem the value for jsh_assetcategory.isystem
     *
     * @mbggenerated
     */
    public void setIsystem(Byte isystem) {
        this.isystem = isystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_assetcategory.description
     *
     * @return the value of jsh_assetcategory.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_assetcategory.description
     *
     * @param description the value for jsh_assetcategory.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}