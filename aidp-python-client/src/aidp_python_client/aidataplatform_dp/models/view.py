# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class View(object):
    """
    Information about the view in the schema.
    """

    #: A constant which can be used with the lifecycle_state property of a View.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new View object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this View.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this View.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this View.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this View.
        :type schema_key: str

        :param view_text:
            The value to assign to the view_text property of this View.
        :type view_text: str

        :param description:
            The value to assign to the description property of this View.
        :type description: str

        :param view_fields:
            The value to assign to the view_fields property of this View.
        :type view_fields: list[oci.aidataplatform_dp.models.ViewFieldDetails]

        :param time_created:
            The value to assign to the time_created property of this View.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this View.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this View.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this View.
        :type updated_by: str

        :param view_properties:
            The value to assign to the view_properties property of this View.
        :type view_properties: list[oci.aidataplatform_dp.models.ViewProperty]

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this View.
            Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this View.
        :type lifecycle_state_details: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'view_text': 'str',
            'description': 'str',
            'view_fields': 'list[ViewFieldDetails]',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'view_properties': 'list[ViewProperty]',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'view_text': 'viewText',
            'description': 'description',
            'view_fields': 'viewFields',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'view_properties': 'viewProperties',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails'
        }

        self._key = None
        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._view_text = None
        self._description = None
        self._view_fields = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._view_properties = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None

    @property
    def key(self):
        """
        Gets the key of this View.
        The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>


        :return: The key of this View.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this View.
        The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>


        :param key: The key of this View.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this View.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :return: The display_name of this View.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this View.
        A user-friendly name. Has to be unique within the scope of the schema and is changeable.


        :param display_name: The display_name of this View.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this View.
        The name of the catalog to which this view belongs.


        :return: The catalog_key of this View.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this View.
        The name of the catalog to which this view belongs.


        :param catalog_key: The catalog_key of this View.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this View.
        The name of the Schema to which this view belongs.


        :return: The schema_key of this View.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this View.
        The name of the Schema to which this view belongs.


        :param schema_key: The schema_key of this View.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def view_text(self):
        """
        Gets the view_text of this View.
        The Query used to create the view.


        :return: The view_text of this View.
        :rtype: str
        """
        return self._view_text

    @view_text.setter
    def view_text(self, view_text):
        """
        Sets the view_text of this View.
        The Query used to create the view.


        :param view_text: The view_text of this View.
        :type: str
        """
        self._view_text = view_text

    @property
    def description(self):
        """
        Gets the description of this View.
        The description of the view.


        :return: The description of this View.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this View.
        The description of the view.


        :param description: The description of this View.
        :type: str
        """
        self._description = description

    @property
    def view_fields(self):
        """
        Gets the view_fields of this View.
        Columns for view.


        :return: The view_fields of this View.
        :rtype: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        return self._view_fields

    @view_fields.setter
    def view_fields(self, view_fields):
        """
        Sets the view_fields of this View.
        Columns for view.


        :param view_fields: The view_fields of this View.
        :type: list[oci.aidataplatform_dp.models.ViewFieldDetails]
        """
        self._view_fields = view_fields

    @property
    def time_created(self):
        """
        Gets the time_created of this View.
        The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this View.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this View.
        The date and time the View was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this View.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this View.
        The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this View.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this View.
        The date and time the View was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this View.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this View.
        The ID of the user/principal who created the view.


        :return: The created_by of this View.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this View.
        The ID of the user/principal who created the view.


        :param created_by: The created_by of this View.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this View.
        The ID of the user who last updated the view.


        :return: The updated_by of this View.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this View.
        The ID of the user who last updated the view.


        :param updated_by: The updated_by of this View.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def view_properties(self):
        """
        Gets the view_properties of this View.
        View Properties.


        :return: The view_properties of this View.
        :rtype: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        return self._view_properties

    @view_properties.setter
    def view_properties(self, view_properties):
        """
        Sets the view_properties of this View.
        View Properties.


        :param view_properties: The view_properties of this View.
        :type: list[oci.aidataplatform_dp.models.ViewProperty]
        """
        self._view_properties = view_properties

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this View.
        The state of the view.

        Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this View.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this View.
        The state of the view.


        :param lifecycle_state: The lifecycle_state of this View.
        :type: str
        """
        allowed_values = ["ACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this View.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_state_details of this View.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this View.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_state_details: The lifecycle_state_details of this View.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
