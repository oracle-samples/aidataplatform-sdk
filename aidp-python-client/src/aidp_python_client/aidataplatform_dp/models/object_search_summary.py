# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ObjectSearchSummary(object):
    """
    A Search object in a Data Lake
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ObjectSearchSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ObjectSearchSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ObjectSearchSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this ObjectSearchSummary.
        :type description: str

        :param type:
            The value to assign to the type property of this ObjectSearchSummary.
        :type type: str

        :param path:
            The value to assign to the path property of this ObjectSearchSummary.
        :type path: str

        :param time_created:
            The value to assign to the time_created property of this ObjectSearchSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ObjectSearchSummary.
        :type time_updated: datetime

        :param owner:
            The value to assign to the owner property of this ObjectSearchSummary.
        :type owner: str

        :param created_by_name:
            The value to assign to the created_by_name property of this ObjectSearchSummary.
        :type created_by_name: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this ObjectSearchSummary.
        :type updated_by_name: str

        :param workspace_key:
            The value to assign to the workspace_key property of this ObjectSearchSummary.
        :type workspace_key: str

        :param workspace_name:
            The value to assign to the workspace_name property of this ObjectSearchSummary.
        :type workspace_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this ObjectSearchSummary.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this ObjectSearchSummary.
        :type schema_key: str

        :param hit_highlights:
            The value to assign to the hit_highlights property of this ObjectSearchSummary.
        :type hit_highlights: list[str]

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'type': 'str',
            'path': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'owner': 'str',
            'created_by_name': 'str',
            'updated_by_name': 'str',
            'workspace_key': 'str',
            'workspace_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'hit_highlights': 'list[str]'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'type': 'type',
            'path': 'path',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'owner': 'owner',
            'created_by_name': 'createdByName',
            'updated_by_name': 'updatedByName',
            'workspace_key': 'workspaceKey',
            'workspace_name': 'workspaceName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'hit_highlights': 'hitHighlights'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._type = None
        self._path = None
        self._time_created = None
        self._time_updated = None
        self._owner = None
        self._created_by_name = None
        self._updated_by_name = None
        self._workspace_key = None
        self._workspace_name = None
        self._catalog_key = None
        self._schema_key = None
        self._hit_highlights = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ObjectSearchSummary.
        The key of the object


        :return: The key of this ObjectSearchSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ObjectSearchSummary.
        The key of the object


        :param key: The key of this ObjectSearchSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ObjectSearchSummary.
        A user-friendly name.


        :return: The display_name of this ObjectSearchSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ObjectSearchSummary.
        A user-friendly name.


        :param display_name: The display_name of this ObjectSearchSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        **[Required]** Gets the description of this ObjectSearchSummary.
        Description of the object


        :return: The description of this ObjectSearchSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ObjectSearchSummary.
        Description of the object


        :param description: The description of this ObjectSearchSummary.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ObjectSearchSummary.
        The type of the Object


        :return: The type of this ObjectSearchSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ObjectSearchSummary.
        The type of the Object


        :param type: The type of this ObjectSearchSummary.
        :type: str
        """
        self._type = type

    @property
    def path(self):
        """
        **[Required]** Gets the path of this ObjectSearchSummary.
        Path of object.


        :return: The path of this ObjectSearchSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ObjectSearchSummary.
        Path of object.


        :param path: The path of this ObjectSearchSummary.
        :type: str
        """
        self._path = path

    @property
    def time_created(self):
        """
        Gets the time_created of this ObjectSearchSummary.
        The date and time the object was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_created of this ObjectSearchSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ObjectSearchSummary.
        The date and time the object was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_created: The time_created of this ObjectSearchSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        **[Required]** Gets the time_updated of this ObjectSearchSummary.
        The date and time the object was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_updated of this ObjectSearchSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ObjectSearchSummary.
        The date and time the object was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_updated: The time_updated of this ObjectSearchSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def owner(self):
        """
        Gets the owner of this ObjectSearchSummary.
        Name of the owner of the record


        :return: The owner of this ObjectSearchSummary.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner):
        """
        Sets the owner of this ObjectSearchSummary.
        Name of the owner of the record


        :param owner: The owner of this ObjectSearchSummary.
        :type: str
        """
        self._owner = owner

    @property
    def created_by_name(self):
        """
        **[Required]** Gets the created_by_name of this ObjectSearchSummary.
        Name of the user who created this record


        :return: The created_by_name of this ObjectSearchSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this ObjectSearchSummary.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this ObjectSearchSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this ObjectSearchSummary.
        Name of the user who updated this record


        :return: The updated_by_name of this ObjectSearchSummary.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this ObjectSearchSummary.
        Name of the user who updated this record


        :param updated_by_name: The updated_by_name of this ObjectSearchSummary.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this ObjectSearchSummary.
        Key of the workspace.


        :return: The workspace_key of this ObjectSearchSummary.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this ObjectSearchSummary.
        Key of the workspace.


        :param workspace_key: The workspace_key of this ObjectSearchSummary.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def workspace_name(self):
        """
        Gets the workspace_name of this ObjectSearchSummary.
        Name of the workspace.


        :return: The workspace_name of this ObjectSearchSummary.
        :rtype: str
        """
        return self._workspace_name

    @workspace_name.setter
    def workspace_name(self, workspace_name):
        """
        Sets the workspace_name of this ObjectSearchSummary.
        Name of the workspace.


        :param workspace_name: The workspace_name of this ObjectSearchSummary.
        :type: str
        """
        self._workspace_name = workspace_name

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this ObjectSearchSummary.
        Key of the catalog.


        :return: The catalog_key of this ObjectSearchSummary.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this ObjectSearchSummary.
        Key of the catalog.


        :param catalog_key: The catalog_key of this ObjectSearchSummary.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this ObjectSearchSummary.
        Key of the schema.


        :return: The schema_key of this ObjectSearchSummary.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this ObjectSearchSummary.
        Key of the schema.


        :param schema_key: The schema_key of this ObjectSearchSummary.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def hit_highlights(self):
        """
        Gets the hit_highlights of this ObjectSearchSummary.
        Highlights related to this notebook object


        :return: The hit_highlights of this ObjectSearchSummary.
        :rtype: list[str]
        """
        return self._hit_highlights

    @hit_highlights.setter
    def hit_highlights(self, hit_highlights):
        """
        Sets the hit_highlights of this ObjectSearchSummary.
        Highlights related to this notebook object


        :param hit_highlights: The hit_highlights of this ObjectSearchSummary.
        :type: list[str]
        """
        self._hit_highlights = hit_highlights

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
