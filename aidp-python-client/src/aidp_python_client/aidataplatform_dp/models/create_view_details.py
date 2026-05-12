# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateViewDetails(object):
    """
    The data to create a view.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateViewDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateViewDetails.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this CreateViewDetails.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this CreateViewDetails.
        :type schema_key: str

        :param description:
            The value to assign to the description property of this CreateViewDetails.
        :type description: str

        :param view_text:
            The value to assign to the view_text property of this CreateViewDetails.
        :type view_text: str

        :param view_properties:
            The value to assign to the view_properties property of this CreateViewDetails.
        :type view_properties: list[oci.aidataplatform_dp.models.ViewProperty]

        :param view_fields:
            The value to assign to the view_fields property of this CreateViewDetails.
        :type view_fields: list[oci.aidataplatform_dp.models.ViewFieldDetails]

        """
        self.swagger_types = {
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'description': 'str',
            'view_text': 'str',
            'view_properties': 'list[ViewProperty]',
            'view_fields': 'list[ViewFieldDetails]'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'description': 'description',
            'view_text': 'viewText',
            'view_properties': 'viewProperties',
            'view_fields': 'viewFields'
        }

        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._description = None
        self._view_text = None
        self._view_properties = None
        self._view_fields = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateViewDetails.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :return: The display_name of this CreateViewDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateViewDetails.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :param display_name: The display_name of this CreateViewDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this CreateViewDetails.
        The name of the catalog to which this view belongs.


        :return: The catalog_key of this CreateViewDetails.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this CreateViewDetails.
        The name of the catalog to which this view belongs.


        :param catalog_key: The catalog_key of this CreateViewDetails.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this CreateViewDetails.
        The name of the Schema to which this view belongs.


        :return: The schema_key of this CreateViewDetails.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this CreateViewDetails.
        The name of the Schema to which this view belongs.


        :param schema_key: The schema_key of this CreateViewDetails.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def description(self):
        """
        Gets the description of this CreateViewDetails.
        The description of the view.


        :return: The description of this CreateViewDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateViewDetails.
        The description of the view.


        :param description: The description of this CreateViewDetails.
        :type: str
        """
        self._description = description

    @property
    def view_text(self):
        """
        **[Required]** Gets the view_text of this CreateViewDetails.
        The Query used to create the view.


        :return: The view_text of this CreateViewDetails.
        :rtype: str
        """
        return self._view_text

    @view_text.setter
    def view_text(self, view_text):
        """
        Sets the view_text of this CreateViewDetails.
        The Query used to create the view.


        :param view_text: The view_text of this CreateViewDetails.
        :type: str
        """
        self._view_text = view_text

    @property
    def view_properties(self):
        """
        Gets the view_properties of this CreateViewDetails.
        View Properties.


        :return: The view_properties of this CreateViewDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        return self._view_properties

    @view_properties.setter
    def view_properties(self, view_properties):
        """
        Sets the view_properties of this CreateViewDetails.
        View Properties.


        :param view_properties: The view_properties of this CreateViewDetails.
        :type: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        self._view_properties = view_properties

    @property
    def view_fields(self):
        """
        Gets the view_fields of this CreateViewDetails.
        Columns for view.


        :return: The view_fields of this CreateViewDetails.
        :rtype: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        return self._view_fields

    @view_fields.setter
    def view_fields(self, view_fields):
        """
        Sets the view_fields of this CreateViewDetails.
        Columns for view.


        :param view_fields: The view_fields of this CreateViewDetails.
        :type: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        self._view_fields = view_fields

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
