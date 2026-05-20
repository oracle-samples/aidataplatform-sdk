# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ViewUpdateDetails(object):
    """
    The details for updating a view.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ViewUpdateDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this ViewUpdateDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this ViewUpdateDetails.
        :type description: str

        :param view_text:
            The value to assign to the view_text property of this ViewUpdateDetails.
        :type view_text: str

        :param view_fields:
            The value to assign to the view_fields property of this ViewUpdateDetails.
        :type view_fields: list[oci.aidataplatform_dp.models.ViewFieldDetails]

        :param add_view_properties:
            The value to assign to the add_view_properties property of this ViewUpdateDetails.
        :type add_view_properties: list[oci.aidataplatform_dp.models.ViewProperty]

        :param drop_view_properties:
            The value to assign to the drop_view_properties property of this ViewUpdateDetails.
        :type drop_view_properties: list[oci.aidataplatform_dp.models.ViewProperty]

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'view_text': 'str',
            'view_fields': 'list[ViewFieldDetails]',
            'add_view_properties': 'list[ViewProperty]',
            'drop_view_properties': 'list[ViewProperty]'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'view_text': 'viewText',
            'view_fields': 'viewFields',
            'add_view_properties': 'addViewProperties',
            'drop_view_properties': 'dropViewProperties'
        }

        self._display_name = None
        self._description = None
        self._view_text = None
        self._view_fields = None
        self._add_view_properties = None
        self._drop_view_properties = None

    @property
    def display_name(self):
        """
        Gets the display_name of this ViewUpdateDetails.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :return: The display_name of this ViewUpdateDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ViewUpdateDetails.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :param display_name: The display_name of this ViewUpdateDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this ViewUpdateDetails.
        The description of the view.


        :return: The description of this ViewUpdateDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ViewUpdateDetails.
        The description of the view.


        :param description: The description of this ViewUpdateDetails.
        :type: str
        """
        self._description = description

    @property
    def view_text(self):
        """
        Gets the view_text of this ViewUpdateDetails.
        The Query used to create the view.


        :return: The view_text of this ViewUpdateDetails.
        :rtype: str
        """
        return self._view_text

    @view_text.setter
    def view_text(self, view_text):
        """
        Sets the view_text of this ViewUpdateDetails.
        The Query used to create the view.


        :param view_text: The view_text of this ViewUpdateDetails.
        :type: str
        """
        self._view_text = view_text

    @property
    def view_fields(self):
        """
        Gets the view_fields of this ViewUpdateDetails.
        Columns for view.


        :return: The view_fields of this ViewUpdateDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        return self._view_fields

    @view_fields.setter
    def view_fields(self, view_fields):
        """
        Sets the view_fields of this ViewUpdateDetails.
        Columns for view.


        :param view_fields: The view_fields of this ViewUpdateDetails.
        :type: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        self._view_fields = view_fields

    @property
    def add_view_properties(self):
        """
        Gets the add_view_properties of this ViewUpdateDetails.
        View Properties.


        :return: The add_view_properties of this ViewUpdateDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        return self._add_view_properties

    @add_view_properties.setter
    def add_view_properties(self, add_view_properties):
        """
        Sets the add_view_properties of this ViewUpdateDetails.
        View Properties.


        :param add_view_properties: The add_view_properties of this ViewUpdateDetails.
        :type: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        self._add_view_properties = add_view_properties

    @property
    def drop_view_properties(self):
        """
        Gets the drop_view_properties of this ViewUpdateDetails.
        View Properties.


        :return: The drop_view_properties of this ViewUpdateDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        return self._drop_view_properties

    @drop_view_properties.setter
    def drop_view_properties(self, drop_view_properties):
        """
        Sets the drop_view_properties of this ViewUpdateDetails.
        View Properties.


        :param drop_view_properties: The drop_view_properties of this ViewUpdateDetails.
        :type: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        self._drop_view_properties = drop_view_properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
