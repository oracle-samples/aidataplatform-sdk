# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BucketSummary(object):
    """
    Summary information about a Bucket.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new BucketSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param namespace:
            The value to assign to the namespace property of this BucketSummary.
        :type namespace: str

        :param name:
            The value to assign to the name property of this BucketSummary.
        :type name: str

        :param compartment_id:
            The value to assign to the compartment_id property of this BucketSummary.
        :type compartment_id: str

        :param created_by:
            The value to assign to the created_by property of this BucketSummary.
        :type created_by: str

        :param time_created:
            The value to assign to the time_created property of this BucketSummary.
        :type time_created: datetime

        """
        self.swagger_types = {
            'namespace': 'str',
            'name': 'str',
            'compartment_id': 'str',
            'created_by': 'str',
            'time_created': 'datetime'
        }

        self.attribute_map = {
            'namespace': 'namespace',
            'name': 'name',
            'compartment_id': 'compartmentId',
            'created_by': 'createdBy',
            'time_created': 'timeCreated'
        }

        self._namespace = None
        self._name = None
        self._compartment_id = None
        self._created_by = None
        self._time_created = None

    @property
    def namespace(self):
        """
        Gets the namespace of this BucketSummary.
        The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.


        :return: The namespace of this BucketSummary.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this BucketSummary.
        The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.


        :param namespace: The namespace of this BucketSummary.
        :type: str
        """
        self._namespace = namespace

    @property
    def name(self):
        """
        **[Required]** Gets the name of this BucketSummary.
        Bucket name


        :return: The name of this BucketSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this BucketSummary.
        Bucket name


        :param name: The name of this BucketSummary.
        :type: str
        """
        self._name = name

    @property
    def compartment_id(self):
        """
        Gets the compartment_id of this BucketSummary.
        The `OCID`__ of the compartment in which to list resources.

        __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm


        :return: The compartment_id of this BucketSummary.
        :rtype: str
        """
        return self._compartment_id

    @compartment_id.setter
    def compartment_id(self, compartment_id):
        """
        Sets the compartment_id of this BucketSummary.
        The `OCID`__ of the compartment in which to list resources.

        __ https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm


        :param compartment_id: The compartment_id of this BucketSummary.
        :type: str
        """
        self._compartment_id = compartment_id

    @property
    def created_by(self):
        """
        Gets the created_by of this BucketSummary.
        The ID of the user who created the schema


        :return: The created_by of this BucketSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this BucketSummary.
        The ID of the user who created the schema


        :param created_by: The created_by of this BucketSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this BucketSummary.
        The date and time the Data Lake Schema was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_created of this BucketSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this BucketSummary.
        The date and time the Data Lake Schema was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_created: The time_created of this BucketSummary.
        :type: datetime
        """
        self._time_created = time_created

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
