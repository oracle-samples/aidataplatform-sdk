# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PatchSessionDetails(object):
    """
    Details to update a session.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PatchSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this PatchSessionDetails.
        :type id: str

        :param name:
            The value to assign to the name property of this PatchSessionDetails.
        :type name: str

        :param path:
            The value to assign to the path property of this PatchSessionDetails.
        :type path: str

        :param type:
            The value to assign to the type property of this PatchSessionDetails.
        :type type: str

        :param kernel:
            The value to assign to the kernel property of this PatchSessionDetails.
        :type kernel: oci.aidataplatform_dp.models.Kernel

        :param cluster_id:
            The value to assign to the cluster_id property of this PatchSessionDetails.
        :type cluster_id: str

        :param must_refresh_context:
            The value to assign to the must_refresh_context property of this PatchSessionDetails.
        :type must_refresh_context: bool

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'path': 'str',
            'type': 'str',
            'kernel': 'Kernel',
            'cluster_id': 'str',
            'must_refresh_context': 'bool'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'path': 'path',
            'type': 'type',
            'kernel': 'kernel',
            'cluster_id': 'cluster_id',
            'must_refresh_context': 'must_refresh_context'
        }

        self._id = None
        self._name = None
        self._path = None
        self._type = None
        self._kernel = None
        self._cluster_id = None
        self._must_refresh_context = None

    @property
    def id(self):
        """
        Gets the id of this PatchSessionDetails.
        UUID of the session.


        :return: The id of this PatchSessionDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this PatchSessionDetails.
        UUID of the session.


        :param id: The id of this PatchSessionDetails.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        Gets the name of this PatchSessionDetails.
        A user-friendly name for the session.


        :return: The name of this PatchSessionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this PatchSessionDetails.
        A user-friendly name for the session.


        :param name: The name of this PatchSessionDetails.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this PatchSessionDetails.
        Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.


        :return: The path of this PatchSessionDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this PatchSessionDetails.
        Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.


        :param path: The path of this PatchSessionDetails.
        :type: str
        """
        self._path = path

    @property
    def type(self):
        """
        Gets the type of this PatchSessionDetails.
        Type of session.


        :return: The type of this PatchSessionDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this PatchSessionDetails.
        Type of session.


        :param type: The type of this PatchSessionDetails.
        :type: str
        """
        self._type = type

    @property
    def kernel(self):
        """
        Gets the kernel of this PatchSessionDetails.

        :return: The kernel of this PatchSessionDetails.
        :rtype: oci.aidataplatform_dp.models.Kernel
        """
        return self._kernel

    @kernel.setter
    def kernel(self, kernel):
        """
        Sets the kernel of this PatchSessionDetails.

        :param kernel: The kernel of this PatchSessionDetails.
        :type: oci.aidataplatform_dp.models.Kernel
        """
        self._kernel = kernel

    @property
    def cluster_id(self):
        """
        Gets the cluster_id of this PatchSessionDetails.
        Cluster ID.


        :return: The cluster_id of this PatchSessionDetails.
        :rtype: str
        """
        return self._cluster_id

    @cluster_id.setter
    def cluster_id(self, cluster_id):
        """
        Sets the cluster_id of this PatchSessionDetails.
        Cluster ID.


        :param cluster_id: The cluster_id of this PatchSessionDetails.
        :type: str
        """
        self._cluster_id = cluster_id

    @property
    def must_refresh_context(self):
        """
        Gets the must_refresh_context of this PatchSessionDetails.
        Set as True, if a new execution context is needed.


        :return: The must_refresh_context of this PatchSessionDetails.
        :rtype: bool
        """
        return self._must_refresh_context

    @must_refresh_context.setter
    def must_refresh_context(self, must_refresh_context):
        """
        Sets the must_refresh_context of this PatchSessionDetails.
        Set as True, if a new execution context is needed.


        :param must_refresh_context: The must_refresh_context of this PatchSessionDetails.
        :type: bool
        """
        self._must_refresh_context = must_refresh_context

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
