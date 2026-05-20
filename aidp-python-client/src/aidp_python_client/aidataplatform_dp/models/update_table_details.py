# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateTableDetails(object):
    """
    The data to update a table.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateTableDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateTableDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateTableDetails.
        :type description: str

        :param add_table_fields:
            The value to assign to the add_table_fields property of this UpdateTableDetails.
        :type add_table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param drop_table_fields:
            The value to assign to the drop_table_fields property of this UpdateTableDetails.
        :type drop_table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param rename_table_fields:
            The value to assign to the rename_table_fields property of this UpdateTableDetails.
        :type rename_table_fields: list[oci.aidataplatform_dp.models.RenameTableFieldDetails]

        :param add_table_properties:
            The value to assign to the add_table_properties property of this UpdateTableDetails.
        :type add_table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        :param drop_table_properties:
            The value to assign to the drop_table_properties property of this UpdateTableDetails.
        :type drop_table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        :param update_table_fields:
            The value to assign to the update_table_fields property of this UpdateTableDetails.
        :type update_table_fields: list[oci.aidataplatform_dp.models.UpdateTableFieldDetails]

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'add_table_fields': 'list[TableFieldDetails]',
            'drop_table_fields': 'list[TableFieldDetails]',
            'rename_table_fields': 'list[RenameTableFieldDetails]',
            'add_table_properties': 'list[TableProperty]',
            'drop_table_properties': 'list[TableProperty]',
            'update_table_fields': 'list[UpdateTableFieldDetails]'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'add_table_fields': 'addTableFields',
            'drop_table_fields': 'dropTableFields',
            'rename_table_fields': 'renameTableFields',
            'add_table_properties': 'addTableProperties',
            'drop_table_properties': 'dropTableProperties',
            'update_table_fields': 'updateTableFields'
        }

        self._display_name = None
        self._description = None
        self._add_table_fields = None
        self._drop_table_fields = None
        self._rename_table_fields = None
        self._add_table_properties = None
        self._drop_table_properties = None
        self._update_table_fields = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateTableDetails.
        Table name.


        :return: The display_name of this UpdateTableDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateTableDetails.
        Table name.


        :param display_name: The display_name of this UpdateTableDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateTableDetails.
        Table description.


        :return: The description of this UpdateTableDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateTableDetails.
        Table description.


        :param description: The description of this UpdateTableDetails.
        :type: str
        """
        self._description = description

    @property
    def add_table_fields(self):
        """
        Gets the add_table_fields of this UpdateTableDetails.
        Columns for table.


        :return: The add_table_fields of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._add_table_fields

    @add_table_fields.setter
    def add_table_fields(self, add_table_fields):
        """
        Sets the add_table_fields of this UpdateTableDetails.
        Columns for table.


        :param add_table_fields: The add_table_fields of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._add_table_fields = add_table_fields

    @property
    def drop_table_fields(self):
        """
        Gets the drop_table_fields of this UpdateTableDetails.
        Columns for table.


        :return: The drop_table_fields of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        return self._drop_table_fields

    @drop_table_fields.setter
    def drop_table_fields(self, drop_table_fields):
        """
        Sets the drop_table_fields of this UpdateTableDetails.
        Columns for table.


        :param drop_table_fields: The drop_table_fields of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableFieldDetails]
        """
        self._drop_table_fields = drop_table_fields

    @property
    def rename_table_fields(self):
        """
        Gets the rename_table_fields of this UpdateTableDetails.
        Columns for table.


        :return: The rename_table_fields of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.RenameTableFieldDetails]
        """
        return self._rename_table_fields

    @rename_table_fields.setter
    def rename_table_fields(self, rename_table_fields):
        """
        Sets the rename_table_fields of this UpdateTableDetails.
        Columns for table.


        :param rename_table_fields: The rename_table_fields of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.RenameTableFieldDetails]
        """
        self._rename_table_fields = rename_table_fields

    @property
    def add_table_properties(self):
        """
        Gets the add_table_properties of this UpdateTableDetails.
        Table properties.


        :return: The add_table_properties of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableProperty]
        """
        return self._add_table_properties

    @add_table_properties.setter
    def add_table_properties(self, add_table_properties):
        """
        Sets the add_table_properties of this UpdateTableDetails.
        Table properties.


        :param add_table_properties: The add_table_properties of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableProperty]
        """
        self._add_table_properties = add_table_properties

    @property
    def drop_table_properties(self):
        """
        Gets the drop_table_properties of this UpdateTableDetails.
        Table properties.


        :return: The drop_table_properties of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.TableProperty]
        """
        return self._drop_table_properties

    @drop_table_properties.setter
    def drop_table_properties(self, drop_table_properties):
        """
        Sets the drop_table_properties of this UpdateTableDetails.
        Table properties.


        :param drop_table_properties: The drop_table_properties of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.TableProperty]
        """
        self._drop_table_properties = drop_table_properties

    @property
    def update_table_fields(self):
        """
        Gets the update_table_fields of this UpdateTableDetails.
        Update columns in table.


        :return: The update_table_fields of this UpdateTableDetails.
        :rtype: list[oci.aidataplatform_dp.models.UpdateTableFieldDetails]
        """
        return self._update_table_fields

    @update_table_fields.setter
    def update_table_fields(self, update_table_fields):
        """
        Sets the update_table_fields of this UpdateTableDetails.
        Update columns in table.


        :param update_table_fields: The update_table_fields of this UpdateTableDetails.
        :type: list[oci.aidataplatform_dp.models.UpdateTableFieldDetails]
        """
        self._update_table_fields = update_table_fields

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
