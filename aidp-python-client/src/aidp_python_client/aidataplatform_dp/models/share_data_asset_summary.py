# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ShareDataAssetSummary(object):
    """
    Summary information about a share data asset.
    """

    #: A constant which can be used with the type property of a ShareDataAssetSummary.
    #: This constant has a value of "SCHEMA"
    TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the type property of a ShareDataAssetSummary.
    #: This constant has a value of "TABLE"
    TYPE_TABLE = "TABLE"

    #: A constant which can be used with the type property of a ShareDataAssetSummary.
    #: This constant has a value of "VIEW"
    TYPE_VIEW = "VIEW"

    def __init__(self, **kwargs):
        """
        Initializes a new ShareDataAssetSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ShareDataAssetSummary.
            Allowed values for this property are: "SCHEMA", "TABLE", "VIEW", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param name:
            The value to assign to the name property of this ShareDataAssetSummary.
        :type name: str

        :param created_by:
            The value to assign to the created_by property of this ShareDataAssetSummary.
        :type created_by: str

        :param description:
            The value to assign to the description property of this ShareDataAssetSummary.
        :type description: str

        :param catalog:
            The value to assign to the catalog property of this ShareDataAssetSummary.
        :type catalog: str

        :param partition:
            The value to assign to the partition property of this ShareDataAssetSummary.
        :type partition: str

        :param time_created:
            The value to assign to the time_created property of this ShareDataAssetSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ShareDataAssetSummary.
        :type time_updated: datetime

        """
        self.swagger_types = {
            'type': 'str',
            'name': 'str',
            'created_by': 'str',
            'description': 'str',
            'catalog': 'str',
            'partition': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime'
        }

        self.attribute_map = {
            'type': 'type',
            'name': 'name',
            'created_by': 'createdBy',
            'description': 'description',
            'catalog': 'catalog',
            'partition': 'partition',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated'
        }

        self._type = None
        self._name = None
        self._created_by = None
        self._description = None
        self._catalog = None
        self._partition = None
        self._time_created = None
        self._time_updated = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ShareDataAssetSummary.
        The asset type for this update.

        Allowed values for this property are: "SCHEMA", "TABLE", "VIEW", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ShareDataAssetSummary.
        The asset type for this update.


        :param type: The type of this ShareDataAssetSummary.
        :type: str
        """
        allowed_values = ["SCHEMA", "TABLE", "VIEW"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ShareDataAssetSummary.
        The data asset name for this operation.


        :return: The name of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ShareDataAssetSummary.
        The data asset name for this operation.


        :param name: The name of this ShareDataAssetSummary.
        :type: str
        """
        self._name = name

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this ShareDataAssetSummary.
        The ID of the user who created the share data asset.


        :return: The created_by of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ShareDataAssetSummary.
        The ID of the user who created the share data asset.


        :param created_by: The created_by of this ShareDataAssetSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def description(self):
        """
        Gets the description of this ShareDataAssetSummary.
        Short description or comment.


        :return: The description of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ShareDataAssetSummary.
        Short description or comment.


        :param description: The description of this ShareDataAssetSummary.
        :type: str
        """
        self._description = description

    @property
    def catalog(self):
        """
        Gets the catalog of this ShareDataAssetSummary.
        The data asset catalog for this operation.


        :return: The catalog of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._catalog

    @catalog.setter
    def catalog(self, catalog):
        """
        Sets the catalog of this ShareDataAssetSummary.
        The data asset catalog for this operation.


        :param catalog: The catalog of this ShareDataAssetSummary.
        :type: str
        """
        self._catalog = catalog

    @property
    def partition(self):
        """
        Gets the partition of this ShareDataAssetSummary.
        Partition clause information, only applicable for TABLE.


        :return: The partition of this ShareDataAssetSummary.
        :rtype: str
        """
        return self._partition

    @partition.setter
    def partition(self, partition):
        """
        Sets the partition of this ShareDataAssetSummary.
        Partition clause information, only applicable for TABLE.


        :param partition: The partition of this ShareDataAssetSummary.
        :type: str
        """
        self._partition = partition

    @property
    def time_created(self):
        """
        Gets the time_created of this ShareDataAssetSummary.
        The date and time the Delta Share Data Asset was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this ShareDataAssetSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ShareDataAssetSummary.
        The date and time the Delta Share Data Asset was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this ShareDataAssetSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ShareDataAssetSummary.
        The date and time the Delta Share Data Asset was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this ShareDataAssetSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ShareDataAssetSummary.
        The date and time the Delta Share Data Asset was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this ShareDataAssetSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
