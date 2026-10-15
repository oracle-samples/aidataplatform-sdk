# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForComputeDetails(object):
    """
    Lakeproxy Compute resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForComputeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param datalake_id:
            The value to assign to the datalake_id property of this AccessGrantedForComputeDetails.
        :type datalake_id: str

        :param workspace_id:
            The value to assign to the workspace_id property of this AccessGrantedForComputeDetails.
        :type workspace_id: str

        :param compute_id:
            The value to assign to the compute_id property of this AccessGrantedForComputeDetails.
        :type compute_id: str

        """
        self.swagger_types = {
            'datalake_id': 'str',
            'workspace_id': 'str',
            'compute_id': 'str'
        }
        self.attribute_map = {
            'datalake_id': 'datalakeId',
            'workspace_id': 'workspaceId',
            'compute_id': 'computeId'
        }
        self._datalake_id = None
        self._workspace_id = None
        self._compute_id = None

    @property
    def datalake_id(self):
        """
        **[Required]** Gets the datalake_id of this AccessGrantedForComputeDetails.
        Lakeproxy datalakeId.


        :return: The datalake_id of this AccessGrantedForComputeDetails.
        :rtype: str
        """
        return self._datalake_id

    @datalake_id.setter
    def datalake_id(self, datalake_id):
        """
        Sets the datalake_id of this AccessGrantedForComputeDetails.
        Lakeproxy datalakeId.


        :param datalake_id: The datalake_id of this AccessGrantedForComputeDetails.
        :type: str
        """
        self._datalake_id = datalake_id

    @property
    def workspace_id(self):
        """
        **[Required]** Gets the workspace_id of this AccessGrantedForComputeDetails.
        Lakeproxy workspaceId.


        :return: The workspace_id of this AccessGrantedForComputeDetails.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this AccessGrantedForComputeDetails.
        Lakeproxy workspaceId.


        :param workspace_id: The workspace_id of this AccessGrantedForComputeDetails.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def compute_id(self):
        """
        **[Required]** Gets the compute_id of this AccessGrantedForComputeDetails.
        Lakeproxy computeId.


        :return: The compute_id of this AccessGrantedForComputeDetails.
        :rtype: str
        """
        return self._compute_id

    @compute_id.setter
    def compute_id(self, compute_id):
        """
        Sets the compute_id of this AccessGrantedForComputeDetails.
        Lakeproxy computeId.


        :param compute_id: The compute_id of this AccessGrantedForComputeDetails.
        :type: str
        """
        self._compute_id = compute_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
